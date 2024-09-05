package Ejercicios.Enum;

public enum Color {
    ROJO("FF000"), AMARILLO("FFFF00"), AZUL("0000FF");
    private final String valorHexadecimal;

    Color(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    public String getValorHexadecimal() {

        return valorHexadecimal;
    }
}
