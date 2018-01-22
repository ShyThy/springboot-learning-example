package org.spring.springboot.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用于存储商品的信息
 * @author tianhangyu
 * @date 2017/05/18
 * @version v1.0
 */
public class Merchandise implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//是否可开专票
	private String makeSpecialStatus;
	//税收版本号
	private String taxVersions;
	//税收分类编码
	private String taxClassCode;
	//是否免税
	private String taxExemptionStatus;
	//免税内容
	private String taxExemptionConent;
	//创建人名称
	private String createrName;
	//创建时间
	private Date createDate;
	//修改人名称
	private String updaterName;
	//修改时间
	private Date updateDate;
	//商品状态(是否删除-> 0:否 ; 1:是)
	private String status;
	//ID
	private Long id;
	//中文名称
	private String cnName;
	//英文名称
	private String enName;
	//单位
	private String unit;
	//商品编码
	private String productCode;

	/**
	 * 设置：是否可开专票	 */

	public void setMakeSpecialStatus(String makeSpecialStatus) {
		this.makeSpecialStatus = makeSpecialStatus;
	}
	/**
	 * 获取：是否可开专票	 */

		public String getMakeSpecialStatus() {
		return makeSpecialStatus;
	}
	/**
	 * 设置：税收版本号	 */

	public void setTaxVersions(String taxVersions) {
		this.taxVersions = taxVersions;
	}
	/**
	 * 获取：税收版本号	 */

		public String getTaxVersions() {
		return taxVersions;
	}
	/**
	 * 设置：税收分类编码	 */

	public void setTaxClassCode(String taxClassCode) {
		this.taxClassCode = taxClassCode;
	}
	/**
	 * 获取：税收分类编码	 */

		public String getTaxClassCode() {
		return taxClassCode;
	}
	/**
	 * 设置：是否免税	 */

	public void setTaxExemptionStatus(String taxExemptionStatus) {
		this.taxExemptionStatus = taxExemptionStatus;
	}
	/**
	 * 获取：是否免税	 */

		public String getTaxExemptionStatus() {
		return taxExemptionStatus;
	}
	/**
	 * 设置：免税内容	 */

	public void setTaxExemptionConent(String taxExemptionConent) {
		this.taxExemptionConent = taxExemptionConent;
	}
	/**
	 * 获取：免税内容	 */

		public String getTaxExemptionConent() {
		return taxExemptionConent;
	}
	/**
	 * 设置：创建人名称	 */

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}
	/**
	 * 获取：创建人名称	 */

		public String getCreaterName() {
		return createrName;
	}
	/**
	 * 设置：创建时间	 */

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：创建时间	 */

		public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：修改人名称	 */

	public void setUpdaterName(String updaterName) {
		this.updaterName = updaterName;
	}
	/**
	 * 获取：修改人名称	 */

		public String getUpdaterName() {
		return updaterName;
	}
	/**
	 * 设置：修改时间	 */

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 获取：修改时间	 */

		public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * 设置：商品状态	 */

	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：商品状态	 */

		public String getStatus() {
		return status;
	}
	/**
	 * 设置：ID	 */

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：ID	 */

		public Long getId() {
		return id;
	}
	/**
	 * 设置：中文名称	 */

	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	/**
	 * 获取：中文名称	 */

		public String getCnName() {
		return cnName;
	}
	/**
	 * 设置：英文名称	 */

	public void setEnName(String enName) {
		this.enName = enName;
	}
	/**
	 * 获取：英文名称	 */

		public String getEnName() {
		return enName;
	}
	/**
	 * 设置：单位	 */

	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位	 */

		public String getUnit() {
		return unit;
	}
	/**
	 * 设置：商品编码	 */

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * 获取：商品编码	 */

		public String getProductCode() {
		return productCode;
	}
}
