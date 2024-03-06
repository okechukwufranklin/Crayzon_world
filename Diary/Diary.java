package Diary;

import java.util.ArrayList;

public class Diary {
    private String password;
    private String username;
    private ArrayList<Entry> entries = new ArrayList<>();
    private boolean islocked;

    public Diary(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public boolean isLocked() {
        return islocked;
    }

    public void lockDiary() {
        islocked = true;

    }

    public void unLockDiary(String password) {
        if (this.password.equals(password)) {
            islocked = false;
        }
    }

        public void CreateEntry (String title, String body){

            int id = entries.size() + 1;
            Entry entry = new Entry(id, body, title);
            entries.add(entry);
        }
        public int sizeOfEntries () {
            return entries.size();
        }

        public Entry FindEntryById ( int id){
            for (Entry entry : entries) {
                if (id == entry.getId())
                    return entry;
            }
            return null;
        }
        public void SetPassword (String password){
            this.password = password;
        }
        public boolean ValidatePassword (String password){
            return password.equals(this.password);
        }

        public void deleteEnty ( int id){
            FindEntryById(id);
            entries.remove(id);
        }

        public void updateEntry ( int id, String title, String body){
            FindEntryById(id);
            Entry entry = FindEntryById(id);
            entry.setTitle(title);
            entry.setBody(body);
        }

    public String getUsername() {
        return username;
    }

}

