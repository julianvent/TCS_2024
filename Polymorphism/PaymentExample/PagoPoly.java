abstract class Pago {
    abstract void procesarPago();
}

class TarjetaCredito extends Pago {
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String numeroTarjeta
                        , String fechaExpiracion
                        , String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    void procesarPago() {
        System.out.println("Pago con TDC");
    }

    void verificarLimiteCredito(){
        System.out.println("Verificar credito");
    }
}


class PayPal extends Pago {
    private String emailUsuario;

    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    void procesarPago() {
        System.out.println("Pago con PayPal");
    }

    void enviarRecibo() {
        System.out.println("Enviando recibo");
    }
}

class ProcesadorDePagos {
    void procesar(Pago pago) {
        pago.procesarPago();

        if (pago instanceof TarjetaCredito) {
            TarjetaCredito tarjeta = (TarjetaCredito) pago;
            tarjeta.verificarLimiteCredito();
        } else if (pago instanceof PayPal) {
            PayPal payPal = (PayPal) pago;
            payPal.enviarRecibo();
        }
    }
}

public class PagoPoly {
    public static void main(String[] args) {
        ProcesadorDePagos procesador = new ProcesadorDePagos();

        Pago pagoTDC = new TarjetaCredito("12345", "2020-01-01", "123");

        Pago pagoPaypal = new PayPal("ejemplo@gmail.com");

        procesador.procesar(pagoTDC);
        procesador.procesar(pagoPaypal);
    }
}