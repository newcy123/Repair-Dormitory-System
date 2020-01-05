<template>
  <v-container>
    <v-layout text-center wrap>
      <v-flex xs3 sm6 md9 lg12>
        <br />
        <h1 class="display-2 font-weight-bold mb-3">Enroll Vehicle</h1>

        <v-row justify="center" class="pb-0 mb-0">
          <v-col cols="3">
            <v-text-field label="Test" solo />
          </v-col>
          <v-col cols="1">
            <v-btn large class="light-green">Search</v-btn>
          </v-col>
        </v-row>

        <v-row justify="center">
          <v-col cols="6">
            <v-select class="pa-0 ma-0" label="Staff Name"/>
          </v-col>
        </v-row>

        <v-row justify="center">
          <v-col cols="6">
            <v-select class="pa-0" label="Student Name"/>
          </v-col>
        </v-row>

        <v-row justify="center">
          <v-col cols="6">
            <v-select class="pa-0 ma-0" label="Vehicle Type"/>
          </v-col>
        </v-row>

        <v-row justify="center">
          <v-col cols="3" class="pa-1 mr-1">
            <v-text-field label="License Plate" solo />
          </v-col>
          <v-col cols="3" class="pa-1 ml-1">
            <v-text-field label="Vehicle's Brand" solo />
          </v-col>
        </v-row>

        <v-row justify="center">
          <v-col cols="6" class="pa-0 mx-2">
            <v-text-field label="Other Details" solo height="80px"/>
          </v-col>
        </v-row>

        <v-row justify="center">
          <v-col cols="6" class="pa-0 mx-2">
            <v-btn class="blue">ENROLL</v-btn>
          </v-col>
        </v-row>
      </v-flex>
    </v-layout>

    
  </v-container>
</template>