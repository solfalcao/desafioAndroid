package com.digitalhouse.desafioandroid.models;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;


public class Card implements Parcelable {

    private int imagem;
    private String nomeRestaurante;
    private String horario;

    public Card(int imagem, String nomeRestaurante, String horario) {
        this.imagem = imagem;
        this.nomeRestaurante = nomeRestaurante;
        this.horario = horario;
    }

    protected Card(Parcel in) {
        imagem = in.readInt();
        nomeRestaurante = in.readString();
        horario = in.readString();
    }

    public static final Creator<Card> CREATOR = new Creator<Card>() {
        @Override
        public Card createFromParcel(Parcel in) {
            return new Card( in );
        }

        @Override
        public Card[] newArray(int size) {
            return new Card[size];
        }
    };

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt( imagem );
        dest.writeString( nomeRestaurante );
        dest.writeString( horario );
    }
}
