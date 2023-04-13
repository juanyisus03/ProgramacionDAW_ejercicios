package capitulo07.bloque03.listener;

public interface OperationListener {
	
	
	public void negativeResultSubtraction(OperationEvent e);
	public void resultOverThousand(OperationEvent e);
	public void dividingByZero(OperationEvent e);
	public void squareRootBaseNegative(OperationEvent e);

}
