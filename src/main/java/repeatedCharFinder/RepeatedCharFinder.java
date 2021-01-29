package repeatedCharFinder;

public class RepeatedCharFinder {



public int countfisrtoccurnec(String text) {
int a=1;
while(a<text.length){
if(CharMatcher.is(text.chartAt(a)).countIn(text)==1){
return chartAt(a);}
else{a=a+1}

}
}
}