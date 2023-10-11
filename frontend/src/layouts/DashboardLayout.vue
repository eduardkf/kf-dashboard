<template>
  <q-layout class="bodyStyle" view="lHr lpr lFf">
    <q-header class="bg-transparent" borderless>
      <div class="headerStyle">
        <div style="margin-top: 2vw">
          <h2 class="text-weight-light" style="color: black">Overview</h2>
          <h6
            class="text-weight-light"
            style="color: black; margin-left: 0.5vw"
          >
            11th of October 2023
          </h6>
        </div>

        <div class="cards">
          <q-input
            bg-color="blue-grey-1"
            label-color="black"
            color="blue-grey-1"
            rounded
            outlined
            v-model="text"
            label="Search"
            style="margin-right: 10vw"
          >
            <template v-slot:append>
              <q-icon name="search" />
            </template>
          </q-input>

          <q-card
            flat
            v-ripple
            class="q-mr-md q-mt-sm cursor-pointer q-hoverable cardStyle"
            bordered
          >
            <span class="q-focus-helper"></span>
            <q-card-section>
              <q-icon color="blue-grey-7" size="2rem" name="inbox" />
            </q-card-section>
          </q-card>

          <q-card
            flat
            v-ripple
            class="q-mr-md q-mt-sm cursor-pointer q-hoverable cardStyle"
            bordered
          >
            <span class="q-focus-helper"></span>
            <q-card-section>
              <q-icon color="blue-grey-7" size="2rem" name="notifications" />
            </q-card-section>
          </q-card>
        </div>
      </div>
    </q-header>
    <drawer-layuout></drawer-layuout>
    <q-page-container class="page-container">
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script setup>
import DrawerLayuout from './drawer/DrawerLayout.vue';
</script>

<style scoped>
.bodyStyle {
  min-height: 100%;
  background-color: #eff3f4;
}

.headerStyle {
  margin-left: 1vw;
  margin-right: 1vw;
  display: flex;
  align-items: flex-start;
  flex-direction: row;
  justify-content: space-between;
}

:deep(.q-field--filled.q-field--rounded .q-field__control) {
  border-radius: 28px 28px 28px 28px;
}

:deep(.q-btn .q-focus-helper) {
  color: #53c5ba;
}

:deep(.q-hoverable .q-focus-helper) {
  color: #53c5ba;
}

.cardStyle {
  background: transparent;
  width: 100%;
  height: 4.5vh;
  max-width: 2.5vw;
  display: flex;
  justify-content: center;
  align-items: center;

  border-radius: 10px 10px 10px 10px;
}

.cards {
  display: flex;
  flex-direction: row;
  align-items: flex-start;
  margin-top: 2.5vw;
}
</style>
