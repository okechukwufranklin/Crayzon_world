package Diary;

import bankApp.AccountNotFoundException;

import java.util.ArrayList;

public class Diaries {
    private ArrayList<Diary> diaries = new ArrayList<>();
    public void AddDiary(String Username,String Password){
        Diary diary = new Diary(Username,Password);
        diaries.add(diary);

    }
    public Diary FindDiary(String UserName){
        for (Diary diary :diaries) {
            if (diary.getUsername().equals(UserName))
                return diary;
        }
        return null;
    }
    public void delete(String userName,String password){
        Diary diary = FindDiary(userName);
        if (FindDiary(userName) == null){
            throw new AccountNotFoundException("Account not found");
        }
        diary.ValidatePassword(password);
        if (!diary.ValidatePassword(password)){
            throw new InvalidPasswordException("Incorrect password");
        }
        diaries.remove(diary);
    }
}
