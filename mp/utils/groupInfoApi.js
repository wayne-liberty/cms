const groups = [
  {
    "id": 28
  },
  {
    "id": 29
  }
]
//点击加号（把一个人添加到小组）后的请求数据
//点击+号：PUT /group/{groupId}
//这个put操作尚未实现，先留坑
const reqbody = {
  "leader": {
    "id": 5678
  },
  "members": [
    {
      "id": 8888
    },
    {
      "id": 5324
    }
  ]
}

const perGroup28 = {
  "id": 28,
  "leader": {
    "id": 8888,
    "name": "张三"
  },
  "members": [
    {
      "id": 5324,
      "name": "李四28"
    },
    {
      "id": 5678,
      "name": "王五28"
    }
  ],
  "topics": [
    {
      "id": 257,
      "name": "领域模型与模块"
    }
  ],
  "report": ""
}
const perGroup29 = {
  "id": 29,
  "leader": {
    "id": 8888,
    "name": "张三29"
  },
  "members": [
    {
      "id": 5324,
      "name": "李四29"
    },
    {
      "id": 5678,
      "name": "王五29"
    }
  ],
  "topics": [
    {
      "id": 257,
      "name": "原型设计"
    }
  ],
  "report": ""
}

//包含迟到的学生
const latestudents={
  "numPresent": 4,
    "present": [
      {
        "id": 2357,
        "name": "张三"
      },
      {
        "id": 8232,
        "name": "李四"
      }
    ],
      "late": [
        {
          "id": 3412,
          "name": "王五"
        },
        {
          "id": 5234,
          "name": "王七九"
        }
      ],
        "absent": [
          {
            "id": 34,
            "name": "张六"
          }
        ]
}

//简单地封装了一下wx.request
const myrequest = function (requrl, callback) {
  wx.request({
    url: requrl,
    success: function (res) {
      callback(res.data)
    },
    fail: function () {
      wx.showToast({
        title: '获取后台数据失败',
      })
    }
  })
}

const getGroupsBySeminarId = function (seminarId, callback) {
  callback(groups);
  // let url = '/seminar/'+seminarId+'/group'
  // myrequest(url,callback)
}

const getGroupByGroupId = function (groupId, callback) {
  if(groupId==28){
    callback(perGroup28)
  }
  else if(groupId==29){
    callback(perGroup29)
  }
  else{
    console.log("没有该组")
  } 
  // let url = '/group/'+groupId+'?embedTopics=true'
  // myrequest(url,callback)
}

const getLateStudentByClassId = function(classId,callback){
  callback(latestudents)
  // let url = '/class/'+classId+'/attendance?showLate=true'
  // myrequest(url,callback)
}

export default {
  getGroupsBySeminarId,
  getGroupByGroupId,
  getLateStudentByClassId
}