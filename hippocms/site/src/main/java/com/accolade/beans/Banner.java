package com.accolade.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import com.accolade.beans.Imageset;

@HippoEssentialsGenerated(internalName = "hippocms:bannerdocument")
@Node(jcrType = "hippocms:bannerdocument")
public class Banner extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "hippocms:title")
	public String getTitle() {
		return getProperty("hippocms:title");
	}

	@HippoEssentialsGenerated(internalName = "hippocms:content")
	public HippoHtml getContent() {
		return getHippoHtml("hippocms:content");
	}

	@HippoEssentialsGenerated(internalName = "hippocms:link")
	public HippoBean getLink() {
		return getLinkedBean("hippocms:link", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippocms:image")
	public Imageset getImage() {
		return getLinkedBean("hippocms:image", Imageset.class);
	}
}
