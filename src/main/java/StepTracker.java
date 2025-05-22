import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
  int mincount, totalsteps;
  int totaldays, activedays;
  public StepTracker(int steps){
     mincount = steps;
     totalsteps = 0;
     totaldays = 0;
     activedays = 0;
  }
  public void addDailySteps(int add){
   totalsteps+=add;
   totaldays++;
   if(add>mincount){
    activedays++;
   }
  }
  public int activeDays() {
   return activedays;
  }
  public double averageSteps(){
   if(totaldays>0){
    return (double)totalsteps/totaldays;
   } else{
          return 0.0;
   }
} 
