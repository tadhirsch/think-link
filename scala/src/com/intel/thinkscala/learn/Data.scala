package com.intel.thinkscala.learn
import scala.collection.mutable.HashSet

object Data {
	val stopwords = HashSet("a", "about", "above", "above", "across", "after", "afterwards", 
			"again", "against", "all", "almost", "alone", "along", "already", "also",
			"although","always","am","among", "amongst", "amoungst", "amount",  "an", 
			"and", "another", "any","anyhow","anyone","anything","anyway", "anywhere", 
			"are", "around", "as",  "at", "back","be","became", "because","become",
			"becomes", "becoming", "been", "before", "beforehand", "behind", "being", 
			"below", "beside", "besides", "between", "beyond", "bill", "both", "bottom",
			"but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt", 
			"cry", "de", "describe", "detail", "do", "done", "down", "due", "during", 
			"each", "eg", "either", "else", "elsewhere", "empty", 
			"enough", "etc", "even", "ever", "every", "everyone", "everything", 
			"everywhere", "except", "few", "fifteen", "fify", "fill", "find", "fire", 
			"first", "for", "former", "formerly", "forty", "found",  
			"from", "front", "full", "further", "get", "give", "go", "had", "has", 
			"hasnt", "have", "he", "hence", "her", "here", "hereafter", "hereby", 
			"herein", "hereupon", "hers", "herself", "him", "himself", "his", "how", 
			"however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into", 
			"is", "it", "its", "itself", "keep", "last", "latter", "latterly", "least", 
			"less", "ltd", "made", "many", "may", "me", "meanwhile", "might", "mill", 
			"mine", "more", "moreover", "most", "mostly", "move", "much", "must", 
			"my", "myself", "name", "namely", "neither", "never", "nevertheless", 
			"next", "no", "nobody", "none", "noone", "nor", "not", "nothing", 
			"now", "nowhere", "of", "off", "often", "on", "once", "one", "only", 
			"onto", "or", "other", "others", "otherwise", "our", "ours", "ourselves", 
			"out", "over", "own","part", "per", "perhaps", "please", "put", "rather", 
			"re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", 
			"several", "she", "should", "show", "side", "since", "sincere", 
			"so", "some", "somehow", "someone", "something", "sometime", 
			"sometimes", "somewhere", "still", "such", "system", "take",  
			"than", "that", "the", "their", "them", "themselves", "then", "thence", 
			"there", "thereafter", "thereby", "therefore", "therein", "thereupon", 
			"these", "they", "thickv", "thin", "this", "those", "though", 
			"through", "throughout", "thru", "thus", "to", "together", "too", 
			"top", "toward", "towards", "un", "under", 
			"until", "up", "upon", "us", "very", "via", "was", "we", "well", "were", 
			"what", "whatever", "when", "whence", "whenever", "where", "whereafter", 
			"whereas", "whereby", "wherein", "whereupon", "wherever", "whether", 
			"which", "while", "whither", "who", "whoever", "whole", "whom", "whose", 
			"why", "will", "with", "within", "without", "would", "yet", "you", "your", 
			"yours", "yourself", "yourselves", "the","s");

	val negwords = HashSet("not","t","no","nothing","non","nor","nobody","never","neither","nor");
	
	val stems = List("'s","n't","s","ed","es","ly","est","er","ing","ion","ly","e")
	
}
