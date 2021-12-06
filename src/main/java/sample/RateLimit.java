package sample;

public class RateLimit {

	private int limit;
	private int remaining;
	private int reset;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public RateLimit() {
	}

	/**
	 *
	 * @param limit
	 * @param reset
	 * @param remaining
	 */
	public RateLimit(int limit, int remaining, int reset) {
		super();
		this.limit = limit;
		this.remaining = remaining;
		this.reset = reset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public int getReset() {
		return reset;
	}

	public void setReset(int reset) {
		this.reset = reset;
	}

}
