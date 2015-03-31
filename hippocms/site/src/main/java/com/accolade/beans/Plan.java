package com.accolade.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@HippoEssentialsGenerated(internalName = "hippocms:Plan")
@Node(jcrType = "hippocms:Plan")
public class Plan extends ContentDocument {
	@HippoEssentialsGenerated(internalName = "hippocms:plan")
	public String getPlan() {
		return getProperty("hippocms:plan");
	}

	@HippoEssentialsGenerated(internalName = "hippocms:customer")
	public String getCustomer() {
		return getProperty("hippocms:customer");
	}

	@HippoEssentialsGenerated(internalName = "hippocms:insurance")
	public String getInsurance() {
		return getProperty("hippocms:insurance");
	}

	@HippoEssentialsGenerated(internalName = "hippocms:details")
	public HippoHtml getDetails() {
		return getHippoHtml("hippocms:details");
	}
}
