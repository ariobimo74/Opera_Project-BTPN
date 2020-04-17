/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.btpn.opera.operationsurvey.service.persistence;

import com.btpn.opera.operationsurvey.exception.NoSuchRespondenException;
import com.btpn.opera.operationsurvey.model.Responden;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the responden service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RespondenUtil
 * @generated
 */
@ProviderType
public interface RespondenPersistence extends BasePersistence<Responden> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RespondenUtil} to access the responden persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the responden in the entity cache if it is enabled.
	 *
	 * @param responden the responden
	 */
	public void cacheResult(Responden responden);

	/**
	 * Caches the respondens in the entity cache if it is enabled.
	 *
	 * @param respondens the respondens
	 */
	public void cacheResult(java.util.List<Responden> respondens);

	/**
	 * Creates a new responden with the primary key. Does not add the responden to the database.
	 *
	 * @param id the primary key for the new responden
	 * @return the new responden
	 */
	public Responden create(long id);

	/**
	 * Removes the responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the responden
	 * @return the responden that was removed
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	public Responden remove(long id) throws NoSuchRespondenException;

	public Responden updateImpl(Responden responden);

	/**
	 * Returns the responden with the primary key or throws a <code>NoSuchRespondenException</code> if it could not be found.
	 *
	 * @param id the primary key of the responden
	 * @return the responden
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	public Responden findByPrimaryKey(long id) throws NoSuchRespondenException;

	/**
	 * Returns the responden with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the responden
	 * @return the responden, or <code>null</code> if a responden with the primary key could not be found
	 */
	public Responden fetchByPrimaryKey(long id);

	/**
	 * Returns all the respondens.
	 *
	 * @return the respondens
	 */
	public java.util.List<Responden> findAll();

	/**
	 * Returns a range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @return the range of respondens
	 */
	public java.util.List<Responden> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of respondens
	 */
	@Deprecated
	public java.util.List<Responden> findAll(
		int start, int end, OrderByComparator<Responden> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of respondens
	 */
	public java.util.List<Responden> findAll(
		int start, int end, OrderByComparator<Responden> orderByComparator);

	/**
	 * Removes all the respondens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of respondens.
	 *
	 * @return the number of respondens
	 */
	public int countAll();

}