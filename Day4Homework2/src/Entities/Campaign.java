package Entities;

public class Campaign {
	private int campaignId;
	private String name;
	private String description;
	private int discount;
	
	public Campaign(int campaignId, String name, String description, int discount) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.description = description;
		this.discount = discount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	

}
