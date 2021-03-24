a) 
  
double avetemp = 0.0; 
if (col = 0 || col = temps[0].length -1 || row = 0 || row = temps.length -1){
	return temps[row][col]; 
}
else {
	avetemp += temps[row][col+1]; 
avetemp += temps[row][col-1]; 
avetemp += temps[row+1][col]; 
avetemp += temps[row-1][col]; 
return avetemp/4; 
}

}

b) 
  
public [] [] double newtemps = new double[temps.length-1] [temps[0].length -1]; 
int count = 0; 
for (i = 0; i < newtemps.length ; i++)
	for (j = 0; j < newtemps[0].length; j++)
		newtemps[i][j] = computeTemp(i, j); 
for (i = 0; i < newtemps.length ; i++)
	for (j = 0; j < newtemps[0].length; j++)
		if (Math.abs(newtemps[i][j] - temps[i][j]) <= tolerance){
			count ++; 
    }
		temps[i][j] = newtemps[i][j] 
if (count == (temps.length) * (temps[0].length){
      return True; 
  }
