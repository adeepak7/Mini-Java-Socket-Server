
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEEPAK AHIRE
 */
public class User implements Serializable
{
    private String userID;
    private String userName;
    private String userCollegeName;
    private boolean userCategory;
    private int score;
    private int correctCount,wrongCount,skipCount;
    
    public User()   
    {
        this.userID   = null;
        this.userName = null;
        this.userCollegeName = null;
        this.userCategory = false;
        this.score = 0;
        this.correctCount=this.wrongCount=this.skipCount=0;
    }
    
    public User(String userID, String userName, String userCollegeName, boolean userCategory,int correctCount,int wrongCount,int skipCount,int score)
    {
        
        this.userID   = userID;
        this.userName = userName;
        this.userCollegeName = userCollegeName;
        this.userCategory = false;
        this.score = score;
        this.correctCount=correctCount;
        this.wrongCount=wrongCount;
        this.skipCount=skipCount;
    }
    
    /**
     * 
     * @param userID
     * @param userName
     * @param userCollegeName
     * @param userCategory 
     * 
     * Sets the Basic information of USER.
     */
    
    public void setUserID(String userID)
    {
        this.userID = userID;
    }
    
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
     
    public void setUserCollegeName(String userCollegeName)
    {
        this.userCollegeName=userCollegeName;
    }
    
    public void setUserCategory(boolean userCategory)
    {
        this.userCategory = userCategory;
    }
    
    public void setScore(int increment)
    {
        this.score = this.score + increment;
        
        if(increment > 0)
        {
            this.correctCount++;
        }
        else if(increment < 0)
        {
            this.wrongCount++;
        }
        else
        {
            this.skipCount++;
            this.score--;
        }
    }
    
    public int getScore()
    {
        return this.score;
    }

    public int getCorrectCount()
    {
        return this.correctCount;
    }

    public int getWrongCount()
    {
        return this.wrongCount;
    }
    
    public int getskipCount()
    {
        return this.skipCount;
    }

    public String getUserID()
    {
        return this.userID;
    }
    
    public String getUserName()
    {
        return this.userName;
    }
     
    public String  getUserCollegeName()
    {
        return this.userCollegeName;
    }
    
    public boolean getUserCategory()
    {
        return this.userCategory;
    }
    
    public String toString()
    {
        String s = "ID:"+this.userID+"\nNAME:"+this.userName+"\nCOLLEGE:"+this.userCollegeName+"\nCATEGORY:"+this.userCategory+"\nCORRECT ANS:"+this.correctCount+"\nWRONG ANS:"+this.wrongCount +"\nSKIP AND:"+this.skipCount+ "\nSCORE:"+this.score;
        return s;
    }
}
