package sample;

import java.util.List;

public class Example {

	private Meta meta;
	private List<Result> result = null;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Example() {
	}

	/**
	 *
	 * @param result
	 * @param meta
	 */
	public Example(Meta meta, List<Result> result) {
		super();
		this.meta = meta;
		this.result = result;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

}