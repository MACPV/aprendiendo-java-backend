package Ejercicios.Enum;

public class ConvertidorColor {
    public static Color convertirHexadecimal(String hexadecimal) {
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(hexadecimal)) {
                return color;
            }
        }
        return null;
    }
}
