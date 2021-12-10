import java.util.Random;
public class EmpWageComputation{
public static void main(String args[]){
//@start
System.out.println("Welcome to emp wage computation program on master branch");
//@uc1
Random rand= new  Random();
final int fullDayTime = 8;
int presentOrAbsent = rand.nextInt(2) ;
int dailyWorkHours= rand.nextInt(9) ;
if(presentOrAbsent==1) {
System.out.println("employ is Present");
System.out.println("This employ's totel working hour is :-"+dailyWorkHours+" so employs wage is :- "+dailyWorkHours*20);//wage per hour is 20 given 
}
else 
	System.out.println("Employ is absent");
}
}


