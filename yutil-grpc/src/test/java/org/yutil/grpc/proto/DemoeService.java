// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcServiceInterfaceDemo.proto

package org.yutil.grpc.proto;

public final class DemoeService {
  private DemoeService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DemoService_UserId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DemoService_UserId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DemoService_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DemoService_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DemoService_UserList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DemoService_UserList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GrpcServiceInterfaceDemo.proto\022\013DemoSe" +
      "rvice\"\024\n\006UserId\022\n\n\002id\030\001 \001(\022\" \n\004User\022\n\n\002i" +
      "d\030\001 \001(\022\022\014\n\004name\030\002 \001(\t\",\n\010UserList\022 \n\005use" +
      "rs\030\001 \001(\0132\021.DemoService.User2~\n\013DemoServi" +
      "ce\0223\n\007GetUser\022\023.DemoService.UserId\032\021.Dem" +
      "oService.User\"\000\022:\n\014FindUserList\022\023.DemoSe" +
      "rvice.UserId\032\021.DemoService.User\"\0000\001B&\n\024o" +
      "rg.yutil.grpc.protoB\014DemoeServiceP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_DemoService_UserId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DemoService_UserId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DemoService_UserId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_DemoService_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DemoService_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DemoService_User_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_DemoService_UserList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DemoService_UserList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DemoService_UserList_descriptor,
        new java.lang.String[] { "Users", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
