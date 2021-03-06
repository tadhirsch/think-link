#!/usr/bin/env python
# encoding: utf-8

"""
Translate an HTML file into simple text, discarding anything that 
might mess up claim detection.
"""

import re

script = re.compile("(<script.*?>.*?</script>)",re.I)
style = re.compile("(<style.*?>.*?</style>)",re.I)
comment = re.compile("<!--.*?-->")
head = re.compile("<head.*?>.*?</head>",re.I)
inline = re.compile("</?(b|em|strong|a|i|img|mark|span).*?>",re.I)
tag = re.compile("</?.*?>")
seps = re.compile("[\.\s]*\.[\.\s]*")
space = re.compile("\s+")
specials = re.compile("\&#?[\w\d]+\;")

def html_to_text(html):
	html = html.replace("\n"," ")
	html = script.sub(". ",html)
	html = style.sub(". ",html)
	html = comment.sub(". ",html)
	html = head.sub(". ",html)
	html = inline.sub(" ",html)
	html = tag.sub(". ",html)
	html = seps.sub(". ",html)
	html = space.sub(" ",html)
	html = specials.sub(" ",html)
	return html
