
package org.shadowice.flocke.andotp.Utilities;

import junit.framework.TestCase;

public class IconTest extends TestCase {

	public void testExists() throws Exception {
		assertNotNull(EntryThumbnail.EntryThumbnails.Codepen);
		assertNotNull(EntryThumbnail.EntryThumbnails.Strava);
		assertNotNull(EntryThumbnail.EntryThumbnails.Ubiquiti);
	}

	public void testValidType() throws Exception {
		assertEquals(EntryThumbnail.AssetType.Vector, EntryThumbnail.EntryThumbnails.Codepen.getAssetType());
		assertEquals(EntryThumbnail.AssetType.Vector, EntryThumbnail.EntryThumbnails.Strava.getAssetType());
		assertEquals(EntryThumbnail.AssetType.Vector, EntryThumbnail.EntryThumbnails.Ubiquiti.getAssetType());
	}
}