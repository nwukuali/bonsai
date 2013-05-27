package org.kuali.rice.kcb.service.impl;

import org.kuali.rice.kcb.bo.RecipientDelivererConfig;
import org.kuali.rice.kcb.bo.RecipientPreference;
import org.kuali.rice.kcb.deliverer.MessageDeliverer;
import org.kuali.rice.kcb.exception.ErrorList;
import org.kuali.rice.kcb.service.RecipientPreferenceService;

import java.util.Collection;
import java.util.HashMap;

public class StubRecipientPreferenceServiceImpl implements RecipientPreferenceService {


	@Override
	public HashMap<String, String> getRecipientPreferences(String recipientId) {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void saveRecipientPreferences(String userid, HashMap<String, String> prefs, MessageDeliverer deliverer) throws ErrorList {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public RecipientPreference getRecipientPreference(String recipientId, String key) {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void saveRecipientPreference(RecipientPreference pref) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void deleteRecipientPreference(RecipientPreference pref) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void removeRecipientDelivererConfigs(String recipientId) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void saveRecipientDelivererConfig(String recipientId, String delivererName, String[] channels) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public Collection<RecipientDelivererConfig> getDeliverersForRecipientAndChannel(String recipientId, String channel) {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public Collection<RecipientDelivererConfig> getDeliverersForRecipient(String recipientId) {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}
}
