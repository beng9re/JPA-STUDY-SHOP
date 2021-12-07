package jpaShop.domain;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
	private String createId;
	private LocalDateTime createData;
	private String modifyId;
	private LocalDateTime modifyData;

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public LocalDateTime getCreateData() {
		return createData;
	}

	public void setCreateData(LocalDateTime createData) {
		this.createData = createData;
	}

	public String getModifyId() {
		return modifyId;
	}

	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}

	public LocalDateTime getModifyData() {
		return modifyData;
	}

	public void setModifyData(LocalDateTime modifyData) {
		this.modifyData = modifyData;
	}
}
