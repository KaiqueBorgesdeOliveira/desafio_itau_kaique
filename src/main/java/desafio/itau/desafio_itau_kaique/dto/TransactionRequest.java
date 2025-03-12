package desafio.itau.desafio_itau_kaique.dto;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


public class TransactionRequest {

    @NotNull
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
