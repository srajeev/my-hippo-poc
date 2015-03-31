package com.accolade.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "hippocms:imageset")
@Node(jcrType = "hippocms:imageset")
public class Imageset extends HippoGalleryImageSet {
	@HippoEssentialsGenerated(internalName = "hippocms:small")
	public HippoGalleryImageBean getSmall() {
		return getBean("hippocms:small", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippocms:large")
	public HippoGalleryImageBean getLarge() {
		return getBean("hippocms:large", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippocms:banner")
	public HippoGalleryImageBean getBanner() {
		return getBean("hippocms:banner", HippoGalleryImageBean.class);
	}
}
