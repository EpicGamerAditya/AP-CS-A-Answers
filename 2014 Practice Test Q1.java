a) 
  int newlength1 = word1.length() / 2; 
  int newlength2 = word2.length() / 2; 
  String newword = word1.substr(0, newlength1 -1) + word2.substr(newlength2, word2.length -1); 
  return newword;
b) 
  int [] newarr = new int[words.length ]; 
  if (words.length % 2 ==0)
    for (i=0; i < words.length ; i=i+2){
	  	  newarr[i] = this.recombine(words[i], words[i+1]); 
	  	  newarr[i+1] = this.recombine(words[i+1], words[i]);
	  return newarr; 
