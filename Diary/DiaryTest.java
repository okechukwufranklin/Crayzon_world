package Diary;

import bankApp.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
private Diary diary;
    @BeforeEach
    public void setUp() {
         diary = new Diary("franklin", "1223");
    }

    @Test
    public void TestThatDairyDefualtIsUlocked(){

        assertFalse(diary.isLocked());
    }

    @Test
    public void TestThatItCanBeLLocked(){
        assertFalse(diary.isLocked());
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void TesThatDiaryCanBeUnlocked(){
        assertFalse(diary.isLocked());
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unLockDiary("1223");
        assertFalse(diary.isLocked());
    }
    @Test
    public void TestThatEntryCanBeCreated(){
        diary.lockDiary();
        //diary.unLockDiary("1223");
        diary.CreateEntry("test","test");
        assertEquals(1,diary.sizeOfEntries());
    }
    @Test
    public void TestThatMultipeEntryCanBeCreated(){
        diary.lockDiary();
        diary.unLockDiary("1223");
        diary.CreateEntry("test","test");
        diary.CreateEntry("test","Test");
        diary.CreateEntry("test","Test");
        diary.CreateEntry("test","Test");
        assertEquals(4,diary.sizeOfEntries());

    }
    @Test
    public  void TestThatEntyCanBeFoundById(){
        diary.lockDiary();
        diary.unLockDiary("1223");
        diary.CreateEntry("test1","test1");
        diary.CreateEntry("test2","Test2");
        diary.CreateEntry("test3","Test3");
        diary.CreateEntry("test4","Test4");
       assertEquals(4,diary.sizeOfEntries());
        assertEquals("test1",diary.FindEntryById(1).getTitle());
    }
    @Test
    public void TestThatEntryCanBeDeleted(){
        diary.lockDiary();
        diary.unLockDiary("1223");
        diary.CreateEntry("test1","test1");
        diary.CreateEntry("test2","Test2");
        diary.CreateEntry("test3","Test3");
        diary.CreateEntry("test4","Test4");
        assertEquals(4,diary.sizeOfEntries());
        diary.deleteEnty(1);
        assertEquals(3,diary.sizeOfEntries());

    }
    @Test
    public  void TestThatEntryCanBeUpdated(){
        diary.lockDiary();
        diary.unLockDiary("1223");
        diary.CreateEntry("test1","test1");
        diary.CreateEntry("test2","Test2");
        diary.CreateEntry("test3","Test3");
        diary.CreateEntry("test4","Test4");
        assertEquals(4,diary.sizeOfEntries());
        diary.updateEntry(1,"first test","First test");
        assertEquals("first test",diary.FindEntryById(1).getTitle());
        assertEquals("First test",diary.FindEntryById(1).getBody());
    }

    @Test
    public void TestThatAllFunctionWorkTogther(){
        diary.lockDiary();
        diary.unLockDiary("1223");
        diary.CreateEntry("test1","test1");
        diary.CreateEntry("test2","Test2");
        diary.CreateEntry("test3","Test3");
        diary.CreateEntry("test4","Test4");
        assertEquals(4,diary.sizeOfEntries());
        diary.updateEntry(1,"first test","First test");
        assertEquals("first test",diary.FindEntryById(1).getTitle());
        assertEquals("First test",diary.FindEntryById(1).getBody());
        diary.deleteEnty(2);
        assertEquals(3,diary.sizeOfEntries());
    }
}
