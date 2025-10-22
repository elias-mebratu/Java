public class GradeCalculator {
    static int[] score = { 90, 85, 45, 70,50,78,99,78,34 };
    static int best;
    static char g;

    public static int grade(){
        best = score[0];
        for(int i = 0;i <score.length;i++){
            if(score[i] > best){
                best = score[i]; 
            }
        }
        return best;
    }
    public static char getGrade(int score,int best){
        if( score >= best - 10){
            return  'A';
                    
        }else if (score >= best - 20){
                     return 'B';
        }else if(score >= best - 30){
                     return 'C';
        }else if((score >= best - 40)){
                return 'D';
        }else{
                return 'F';
        } 
    }
        
    

    public static void main(String[] args) {
        System.out.println("The higest grade = " + grade());
        best = grade();
        
        for(int i = 0; i < score.length; i++){
            g = getGrade(score[i],best);
            System.out.println("Studet " + (i + 1) + " Score " + score[i] +" grade "+ g );
        }
    }

}
