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

package operation.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import operation.exception.NoSuchAnswersException;

import operation.model.Answers;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the answers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnswersUtil
 * @generated
 */
@ProviderType
public interface AnswersPersistence extends BasePersistence<Answers> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AnswersUtil} to access the answers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the answers in the entity cache if it is enabled.
	 *
	 * @param answers the answers
	 */
	public void cacheResult(Answers answers);

	/**
	 * Caches the answerses in the entity cache if it is enabled.
	 *
	 * @param answerses the answerses
	 */
	public void cacheResult(java.util.List<Answers> answerses);

	/**
	 * Creates a new answers with the primary key. Does not add the answers to the database.
	 *
	 * @param id the primary key for the new answers
	 * @return the new answers
	 */
	public Answers create(long id);

	/**
	 * Removes the answers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the answers
	 * @return the answers that was removed
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	public Answers remove(long id) throws NoSuchAnswersException;

	public Answers updateImpl(Answers answers);

	/**
	 * Returns the answers with the primary key or throws a <code>NoSuchAnswersException</code> if it could not be found.
	 *
	 * @param id the primary key of the answers
	 * @return the answers
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	public Answers findByPrimaryKey(long id) throws NoSuchAnswersException;

	/**
	 * Returns the answers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the answers
	 * @return the answers, or <code>null</code> if a answers with the primary key could not be found
	 */
	public Answers fetchByPrimaryKey(long id);

	/**
	 * Returns all the answerses.
	 *
	 * @return the answerses
	 */
	public java.util.List<Answers> findAll();

	/**
	 * Returns a range of all the answerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @return the range of answerses
	 */
	public java.util.List<Answers> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the answerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of answerses
	 */
	@Deprecated
	public java.util.List<Answers> findAll(
		int start, int end, OrderByComparator<Answers> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the answerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of answerses
	 */
	public java.util.List<Answers> findAll(
		int start, int end, OrderByComparator<Answers> orderByComparator);

	/**
	 * Removes all the answerses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of answerses.
	 *
	 * @return the number of answerses
	 */
	public int countAll();

}