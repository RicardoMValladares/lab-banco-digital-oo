import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SaldoIndisponivelExcepction extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	SaldoIndisponivelExcepction(){
		this.msg = "Saldo inválido - valor saque maior que o saldo.";
	}

}
