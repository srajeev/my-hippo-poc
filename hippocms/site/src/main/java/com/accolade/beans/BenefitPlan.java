package com.accolade.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@HippoEssentialsGenerated(internalName = "hippocms:BenefitPlan")
@Node(jcrType = "hippocms:BenefitPlan")
public class BenefitPlan extends BaseDocument {
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

	@HippoEssentialsGenerated(internalName = "hippostd:tags")
	public String[] getTags() {
		return getProperty("hippostd:tags");
	}

	@HippoEssentialsGenerated(internalName = "hippocms:plandetails")
	public HippoHtml getPlandetails() {
		return getHippoHtml("hippocms:plandetails");
	}
}
