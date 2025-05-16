public class DivisibleByNine{
        public int getNumber(){
                   int count=0;
                  for( int i=1;i<=100;i++){
                    if(i%9==0){
                       System.out.println(i);
                       count++;
} 
}
return count;

}
public static void main(String[] args){
DivisibleByNine obj= new DivisibleByNine();
obj.getNumber();
}
}


            