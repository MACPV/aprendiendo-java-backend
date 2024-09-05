package Ejercicios.Enum;

public enum DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;

    DiaSemana() {
    }

    public boolean esDiaLaborable(Enum DiaSemana) {
        if (DiaSemana == SABADO) {
            return false;
        }
        if (DiaSemana == DOMINGO) {
            return false;
        }
        return true;
    }
}

