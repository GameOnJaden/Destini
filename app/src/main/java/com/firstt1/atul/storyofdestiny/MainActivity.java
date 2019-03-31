package com.firstt1.atul.storyofdestiny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView T_Story;
    Button T_Ans1,T_Ans2;
    private int mStory,mAns1,mAns2;
    private int mStoryIndex = 0;

    CheckStory [] mStories = new CheckStory[]{

            new CheckStory(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new CheckStory(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new CheckStory(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T_Story = findViewById(R.id.T_Story);
        T_Ans1 = findViewById(R.id.T_Ans1);
        T_Ans2 = findViewById(R.id.T_Ans2);

        mStory = mStories[mStoryIndex].getT_StoryId();
        T_Story.setText(mStory);

        mAns1 = mStories[mStoryIndex].getT_Ans1Id();
        T_Ans1.setText(mAns1);

        mAns2 = mStories[mStoryIndex].getT_Ans2Id();
        T_Ans1.setText(mAns1);


        T_Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(mStoryIndex == 1){

                   mStoryIndex = 2;
                   UpdateStory();

               }else if(mStoryIndex == 2){

                   T_Story.setText(R.string.T6_End);
                   T_Ans1.setVisibility(View.GONE);
                   T_Ans2.setVisibility(View.GONE);

               }else{

                   mStoryIndex = 2;
                   UpdateStory();
               }

            }
        });

        T_Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(mStoryIndex == 2){

                   T_Story.setText(R.string.T5_End);
                   T_Ans2.setVisibility(View.GONE);
                   T_Ans1.setVisibility(View.GONE);


               }else if(mStoryIndex == 1){

                   T_Story.setText(R.string.T4_End);
                   T_Ans2.setVisibility(View.GONE);
                   T_Ans1.setVisibility(View.GONE);

               }else{

                   mStoryIndex = 1;
                   UpdateStory();
               }


            }
        });
    }

    public void UpdateStory(){

        if(mStoryIndex == 2) {

            mStory = mStories[mStoryIndex].getT_StoryId();
            T_Story.setText(mStory);

            mAns1 = mStories[mStoryIndex].getT_Ans1Id();
            T_Ans1.setText(mAns1);

            mAns2 = mStories[mStoryIndex].getT_Ans2Id();
            T_Ans2.setText(mAns2);

        }else if(mStoryIndex == 1) {

            mStory = mStories[mStoryIndex].getT_StoryId();
            T_Story.setText(mStory);

            mAns1 = mStories[mStoryIndex].getT_Ans1Id();
            T_Ans1.setText(mAns1);

            mAns2 = mStories[mStoryIndex].getT_Ans2Id();
            T_Ans2.setText(mAns2);
        }

    }


}
