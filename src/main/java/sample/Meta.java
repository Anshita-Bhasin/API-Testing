package sample;

public class Meta {

	private boolean success;
	private int code;
	private String message;
	private int totalCount;
	private int pageCount;
	private int currentPage;
	private int perPage;
	private RateLimit rateLimit;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Meta() {
	}

	/**
	 *
	 * @param pageCount
	 * @param code
	 * @param perPage
	 * @param rateLimit
	 * @param success
	 * @param message
	 * @param totalCount
	 * @param currentPage
	 */
	public Meta(boolean success, int code, String message, int totalCount, int pageCount, int currentPage, int perPage,
			RateLimit rateLimit) {
		super();
		this.success = success;
		this.code = code;
		this.message = message;
		this.totalCount = totalCount;
		this.pageCount = pageCount;
		this.currentPage = currentPage;
		this.perPage = perPage;
		this.rateLimit = rateLimit;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public RateLimit getRateLimit() {
		return rateLimit;
	}

	public void setRateLimit(RateLimit rateLimit) {
		this.rateLimit = rateLimit;
	}

}