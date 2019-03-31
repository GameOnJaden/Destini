package com.firstt1.atul.storyofdestiny;

public class CheckStory {

    private int T_StoryId,T_Ans1Id,T_Ans2Id;

    public CheckStory(int StoryId,int Ans1Id,int Ans2Id ){

        T_StoryId = StoryId;
        T_Ans1Id = Ans1Id;
        T_Ans2Id = Ans2Id;

    }

    public int getT_StoryId() {
        return T_StoryId;
    }

    public void setT_StoryId(int t_StoryId) {
        T_StoryId = t_StoryId;
    }

    public int getT_Ans1Id() {
        return T_Ans1Id;
    }

    public void setT_Ans1Id(int t_Ans1Id) {
        T_Ans1Id = t_Ans1Id;
    }

    public int getT_Ans2Id() {
        return T_Ans2Id;
    }

    public void setT_Ans2Id(int t_Ans2Id) {
        T_Ans2Id = t_Ans2Id;
    }
}
