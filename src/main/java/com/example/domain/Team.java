package com.example.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by BoBinLee on 2015. 11. 10..
 */

@Data
@Entity
@Table(name = "team")
@ToString
public class Team {
	@Id
	@Column(name = "team_id")
	@GeneratedValue
	private int id;
	private String teamName;

	@OneToMany(mappedBy = "team")
	private List<Member> members;
}
