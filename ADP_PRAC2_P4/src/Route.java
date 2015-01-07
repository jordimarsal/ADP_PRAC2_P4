public class Route {
	private String comments;
	private String code;
	private float totalKms;

	public Route(String code) {
		this.setCode(code);
		comments = "comentsRoute " + code;
	}

	public float getTotalKms() {
		return totalKms;
	}

	public void setKms(float kms) {
		totalKms = kms;
	}

	public String getCode() {
		return code;
	}

	private void setCode(String code) {
		this.code = code;
	}

}
