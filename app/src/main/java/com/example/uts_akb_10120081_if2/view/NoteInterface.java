package com.example.uts_akb_10120081_if2.view;

import android.database.Cursor;

import com.example.uts_akb_10120081_if2.model.Note;

/**
 * NAMA    : Naufal Mahdy
 * NIM     : 10120081
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 */
public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
