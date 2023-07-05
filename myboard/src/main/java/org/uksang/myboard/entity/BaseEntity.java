package org.uksang.myboard.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
abstract class BaseEntity {

    /**
     * 가입일자
     */
    @CreatedDate
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    /**
     * 수정일자
     */
    @LastModifiedDate
    @Column(name = "moddate", updatable = false)
    private LocalDateTime modDate;

}
