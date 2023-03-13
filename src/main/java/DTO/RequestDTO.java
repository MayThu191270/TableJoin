package DTO;

public class RequestDTO
{
	private int categoryId;
	private String categoryName;
	private int prod_id;
	private String name;
	private String price;
	private int cat_id;
	public int getCategoryId()
	{
		return categoryId;
	}
	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}
	public String getCategoryName()
	{
		return categoryName;
	}
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}
	public int getProd_id()
	{
		return prod_id;
	}
	public void setProd_id(int prod_id)
	{
		this.prod_id = prod_id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	public int getCat_id()
	{
		return cat_id;
	}
	public void setCat_id(int cat_id)
	{
		this.cat_id = cat_id;
	}
}
