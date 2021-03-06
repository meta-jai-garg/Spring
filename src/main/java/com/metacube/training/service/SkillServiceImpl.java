package com.metacube.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metacube.training.service.SkillService;
import com.metacube.training.dao.SkillDAO;
import com.metacube.training.model.Skill;
import com.metacube.training.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillDAO skillDao;
	@Autowired
	private SkillRepository skillRepo;

	@Override
	public Skill getSkillById(Integer skillId) {
		return skillRepo.findById(skillId).get();
	}

	@Override
	public List<Skill> getAllSkills() {
		List<Skill> skills = new ArrayList<>();
		skillRepo.findAll().forEach(skills::add);
		return skills;
	}

	@Override
	public boolean deleteSkill(Integer id) {
		skillRepo.deleteById(id);
		return true;
	}

	@Override
	public boolean updateSkill(Skill skill) {
		skillRepo.save(skill);
		return true;
	}

	@Override
	public boolean createSkill(Skill skill) {
		skillRepo.save(skill);
		return true;
	}

	@Override
	public Skill getSkillByName(String skillName) {
		return skillRepo.findSkillBySkillName(skillName);
	}
	
	@Override
	public List<Skill> getSkillByNameForEmployee(Integer empCode) {
		return skillDao.getSkillByNameForEmployee(empCode);
	}
}