package com.example.hp.mvpparimpr;

/**
 * Created by HP on 23-08-2017.
 */

public class ParImparCompara {
    private ParImparCallback callback;

    public ParImparCompara(ParImparCallback callback) {
        this.callback = callback;
    }

    public void Compara(String value) {
        if (value.trim().length() > 0) {
            int auxValue = Integer.parseInt(value);
            if (auxValue % 2 == 0) {
                value = "Es numero par";
                callback.sucess(value);
            } else if (auxValue % 2 != 0) {
                value = "Es numero impar";
                callback.sucess(value);
            } else {
                callback.blankinput();
            }
        }
    }
}
