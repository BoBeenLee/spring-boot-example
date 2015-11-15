package com.example.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by BoBinLee on 2015. 11. 8..
 **/

@Data
@Entity
@ToString
@Table(name = "MEMBER")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private long id;
	private String userName;
	private Integer age;

	@ManyToOne
	@JoinColumn(name = "id")
	private Team team;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedAt;

	@Enumerated(EnumType.STRING)
	private RoleType roleType;
}
