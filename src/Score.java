public class Score {

    int experience;
    int gold;

    public Score(){
        experience=0;
        gold=0;
    }

    public void add(int addExperience,int addGold){
        experience=experience+addExperience;
        gold=gold+addGold;
    }

    public String toString() {
        return "gold:"+gold;
    }
}
