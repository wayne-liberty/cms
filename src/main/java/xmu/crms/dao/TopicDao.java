package xmu.crms.dao;

import org.apache.ibatis.annotations.Param;
import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;

import java.math.BigInteger;
import java.util.List;

/**
 * @author shin
 */
public interface TopicDao {
    /**
     * get topic by topicId
     *
     * @param id topic id
     * @return topic
     */
    Topic getTopicById(BigInteger id);


    /**
     * update topic by given topic
     *
     * @param topic topic to update
     * @return if success
     */
    Boolean updateTopic(Topic topic);

    /**
     * insert topic together with seminar id
     *
     * @param seminarId seminar id
     * @param topic     topic
     * @return generated id
     */
    Long insertWithSeminarId(@Param("seminarId") BigInteger seminarId, @Param("topic") Topic topic);

    /**
     * delete topic by topicId.
     *
     * @param id topic id
     * @return if success
     */
    Boolean deleteById(BigInteger id);

    /**
     * get all the topics with specific seminarId
     *
     * @param seminarId seminar id
     * @return list of topic
     */
    List<Topic> getTopicsBySeminarId(BigInteger seminarId);

    /**
     * get topic info in seminar_group_topic table
     *
     * @param topicId topic id
     * @param groupId group id
     * @return seminarGroupTopic
     */
    SeminarGroupTopic getTopicInfoOfGroup(@Param("topicId") BigInteger topicId, @Param("groupId") BigInteger groupId);

    /**
     * delete a record in seminar_group_topic by topic_id and group_id
     *
     * @param topicId topic id
     * @param groupId group id
     * @return whether success
     */
    boolean deleteSeminarGroupTopic(@Param("topicId") BigInteger topicId, @Param("groupId") BigInteger groupId);

    /**
     * delete all records by topic id
     *
     * @param topicId topic id
     * @return number of deleted row
     */
    Integer deleteAllSeminarGroupTopicsByTopicId(BigInteger topicId);
}
