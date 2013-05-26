package za.ac.nwu.bonsai.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import za.ac.nwu.bonsai.businessobject.Holiday;
import za.ac.nwu.bonsai.service.HolidayMaintenanceService;

public class HolidayMaintenanceServiceImpl implements HolidayMaintenanceService {

	@PersistenceContext(unitName = "leave-persistence")
	private EntityManager em;

	@Override
	public void createHoliday(Holiday holiday) {
		em.persist(holiday);
	}

	@Override
	public List<Holiday> getHolidays() {
		return em.createQuery("from " + Holiday.class.getSimpleName()).getResultList();
	}

	@Override
	public void updateHoliday(Holiday holiday) {
		em.merge(holiday);

	}

	@Override
	public void deleteHoliday(Holiday holiday) {
		// TODO : Change this to use @id since all Entities require @id and enforce using generic entity hasid interface
		em.remove(em.find(Holiday.class, holiday.getId()));
		
	}

}
