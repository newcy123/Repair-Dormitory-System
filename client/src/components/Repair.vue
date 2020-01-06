<template>
  <v-content>
    <v-container class="fill-height" fluid>
      <v-row align="center" justify="center">
        <v-col cols="12" sm="8" md="6">
          <v-card class="elevation-12">
            <v-toolbar color="deep-purple" light flat>
            
              <v-icon dark>mdi-wrench</v-icon>&nbsp;&nbsp;
              
               <span class="white--text">
              <v-toolbar-title>ระบบแจ้งซ่อมหอพัก</v-toolbar-title>
              </span>
              <div class="flex-grow-1"></div>
            </v-toolbar>
            <v-card-text>
              <v-select
                v-model="selectedEmployee"
                :items="employees"
                item-text="employee_name"
                item-value="id"
                label="เลือกชื่อนักศึกษา"
                :rules="[(v) => !!v || 'กรุณาเลือกชื่อพนักงาน']"
                required
              ></v-select>

              
              <v-select
                v-model="selectedShowType"
                :items="types"
                item-text="type"
                item-value="id"
                label="เลือกประเภทงาน"
                :rules="[(v) => !!v || 'กรุณาเลือกประเภทการแสดง']"
                required
              ></v-select>

              <v-select
                v-model="selectedShowType"
                :items="types"
                item-text="type"
                item-value="id"
                label="เลือกชื่ออุปกรณ์ที่ชำรุด"
                :rules="[(v) => !!v || 'กรุณาเลือกประเภทการแสดง']"
                required
              ></v-select>

              <v-text-field
                v-model="insertShowName"
                :items="titles"
                item-text="name"
                item-value="id"
                label="กรอกอาการ/ปัญหา"
                :rules="[(v) => !!v || 'กรุณากรอกชื่อการแสดง']"
                required
              ></v-text-field>

              

              <div class="text-center">
                <v-btn class="mr-3" color="warning" @click="Saveshow">แจ้ง</v-btn>
              </div>
            </v-card-text>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </v-content>
</template>