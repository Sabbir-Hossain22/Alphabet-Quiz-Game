package Alpha3;
public abstract class Question {
    private static String[] que = {"_PPLE {Hint:(Fruit)}","HAP_Y {Hint:(Mood)}","B_RD {Hint(Animal)}","PI_ _A {Hint(Food)}","CY_ _E {Hint(Vehicle)}","HIL_ _A {Hint(Fish)}",
            "OR_ _ _E {Hint:(Color)}","BAN_ _ _DESH {Hint:(Country)}", "JA_ _ _A {Hint:(River)}", "C_ _ _OLATE {Hint:(Candy)}"};
    private static String[] ans = {"A","P","I","ZZ","CL","SH","ANG","GLA","MUN","HOC"};

    public static String getQue(int i) {
        return que[i];
    }

    public static String getAns(int i) {
        return ans[i];
    }
} 
