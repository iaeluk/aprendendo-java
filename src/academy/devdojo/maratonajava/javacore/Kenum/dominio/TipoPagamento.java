package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento { //é possível criar enum dentro de classes.
        PIX {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.15;
            }
        },
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CREDITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        //método abstrato não pode ter corpo.
    public abstract double calcularDesconto(double valor);
}